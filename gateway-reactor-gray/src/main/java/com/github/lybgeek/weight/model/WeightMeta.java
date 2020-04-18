package com.github.lybgeek.weight.model;

import java.util.Arrays;
import java.util.Random;

/**
 *
  * 权重元数据对象
  *
  */
 public class WeightMeta<T> {  
     private final Random ran = new Random();
     private final T[] nodes;  
     private final int[] weights;  
     private final int maxW;  
   
     public WeightMeta(T[] nodes, int[] weights) {  
         this.nodes = nodes;  
         this.weights = weights;  
         this.maxW = weights[weights.length - 1];  
     }  
   
     /** 
      * 该方法返回权重随机对象 
      * @return 
      */  
     public T random() {  
         int index = Arrays.binarySearch(weights, ran.nextInt(maxW) + 1);
         if (index < 0) {  
             index = -1 - index;  
         }  
         return nodes[index];  
     }  
   
     public T random(int ranInt) {  
         if (ranInt > maxW) {  
             ranInt = maxW;  
         } else if(ranInt < 0){  
             ranInt = 1;  
         } else {  
             ranInt ++;  
         }  
         int index = Arrays.binarySearch(weights, ranInt);  
         if (index < 0) {  
             index = -1 - index;  
         }  
         return nodes[index];  
     }  
   
     @Override  
     public String toString() {  
         StringBuilder l1 = new StringBuilder();  
         StringBuilder l2 = new StringBuilder("[random]\t");  
         StringBuilder l3 = new StringBuilder("[node]\t\t");  
         l1.append(this.getClass().getName()).append(":").append(this.hashCode()).append(":\n").append("[index]\t\t");  
         for (int i = 0; i < weights.length; i++) {  
             l1.append(i).append("\t");  
             l2.append(weights[i]).append("\t");  
             l3.append(nodes[i]).append("\t");  
         }  
         l1.append("\n");  
         l2.append("\n");  
         l3.append("\n");  
         return l1.append(l2).append(l3).toString();  
     }  
 }