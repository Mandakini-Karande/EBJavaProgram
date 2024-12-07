

		class Stack1{
		
		 static final  int  MAX = 10; 
		   int top; 
		    char a[] = new char[MAX]; // Maximum size of Stack 

		    boolean isEmpty() 
		    { 
		        return (top < 0); 
		    } 
		    Stack1() 
		    { 
		        top = -1; 
		    } 

		    boolean push(char x) 
		    { 
		        if (top >= (MAX - 1)) { 
		            System.out.println("Stack Overflow"); 
		            return false; 
		        } 
		        else { 
		            a[++top] = x; 
		            System.out.println(x + " pushed into stack"); 
		            return true; 
		        } 
		    } 

		/*    int pop() 
		    { 
		        if (top < 0) { 
		            System.out.println("Stack Underflow"); 
		            return 0; 
		        } 
		        else { 
		            char x = a[top--]; 
		            return x; 
		        } 
		    } 
*/
		    
		    char peek() 
		    { 
		        if (top < 0) { 
		            System.out.println("Stack Underflow"); 
		            return 0; 
		        } 
		        else { 
		            char x = a[top]; 
		            return x; 
		        } 
		    } 
		    
		  /*  void print(){ 
		    for(int i = top;i>-1;i--){ 
		    System.out.print(" "+ a[i]); 
		    } 
		} */
		} 

		// Driver code 
		public class StackPeek {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

		        Stack1 s = new Stack1(); 
		        s.push('s'); 
		        s.push('r'); 
		        s.push('t'); 
		     //   System.out.println(s.pop() + " Popped from stack"); 
		        System.out.println("Top element is :" + s.peek()); 
		     //   System.out.print("Elements present in stack :"); 
		       // s.print(); 
		    } 
		}
		
		
		
		
	


