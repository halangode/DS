import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Jesse loves cookies. He wants the sweetness of all his cookies to be greater than value . To do this, Jesse repeatedly mixes two cookies with the least sweetness. He creates a special combined cookie with:

sweetness  Least sweet cookie   2nd least sweet cookie).

He repeats this procedure until all the cookies in his collection have a sweetness . 
You are given Jesse's cookies. Print the number of operations required to give the cookies a sweetness . Print  if this isn't possible.


*/

public class JesseCookiesHeap{
    
    static class Heap {
        int sizeMax;
        int size;
        int[] heap;
        
        public Heap(int s) {
            this.sizeMax = s;
            heap = new int[sizeMax];
            size = -1;
        }
        
        public int getSize() {
            return size;
        }
        
        int getParent(int i) {
            return (i - 1)/2;
        }
        int getLeft(int i) {
            return 2 * i + 1;
        }
        
        int getRight(int i) {
            return 2 * i + 2;
        }
        
        boolean hasParent(int i) {
            if(getParent(i) >= 0) {
                return true;
            }
            return false;
        }
        
        boolean hasLeft(int i) {
            if(getLeft(i) <= size) {
                return true;
            }
            return false;
        }
        
        public int peek() {
            return heap[0];
        }
        
        boolean hasRight(int i) {
            if(getRight(i) <= size) {
                return true;
            }
            return false;
        }
        
        
        public void add(int i) {
            size++;
            if(size < sizeMax) {
                heap[size] = i;
                heapifyUp();
            }
        }
        
        public void showHeap() {
            System.out.println("\nShowing heap...\n");
            for(int i = 0; i <= size; i++) {
                System.out.print(heap[i] + " ");
            }
        }
        
        public int delete() {
            int del = heap[0];
            heap[0] = heap[size];
            size--;
            heapifyDown();
            return del;
        }
        
        void heapifyDown() {
            int index = 0;
            while(hasLeft(index)) {
                int smallest = getLeft(index);
                if(hasRight(index)) {
                    if(heap[smallest] > heap[getRight(index)]) {
                        smallest = getRight(index);
                    }
                }
                if(heap[smallest] < heap[index]) {
                    int temp = heap[smallest];
                    heap[smallest] = heap[index];
                    heap[index] = temp;
                }
                else {
                    break;
                }
                index = smallest;
            }
        } 
        
        void heapifyUp() {
            int index = size;
            while(hasParent(index) && heap[getParent(index)] > heap[index]) {
                int temp = heap[getParent(index)];
                heap[getParent(index)] = heap[index];
                heap[index] = temp;
                index = getParent(index);
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        Heap h = new Heap(n);
        
        for(int i = 0; i < n; i++) {
            h.add(sc.nextInt());
            //h.showHeap();
        }
        
        int count = 0;
        while(h.peek() < k && h.getSize() >= 1) {
            count++;
            int mix1 = h.delete();
            int mix2 = h.delete();
            int newMix = 1 * mix1 + 2 * mix2;
            //System.out.println("\n1: " + mix1 + " 2: " + mix2 + " new: " + newMix); 
            h.add(newMix);
            //h.showHeap();
        }
        if(h.peek() < k) {
            count = -1;
        }
        System.out.println(count);
    }
}