import java.util.Stack;

public class Max_area_Histogram {
    public static void main(String[] args) {
        int heights[] ={2,1,5,6,2,3};
        int n= heights.length;
        int pse [] =new int [n];
        int nse [] =new int [n];
        int width[]=new int [n];
        Stack<Integer> st =new Stack<>();
        for(int i=0;i<n;i++){
            if(st.size()==0) pse[i]=-1;
            while(st.size()>0 && heights[i]<heights[st.peek()]){
                st.pop();
            }
            if(st.size()==0) pse[i]=-1;
            else {
                pse[i]= st.peek();
            }
            st.push(i);
        }
        Stack<Integer> temp =new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(temp.size()==0) nse[i]=n;
            while(temp.size()>0 && heights[i]<heights[temp.peek()]){
                temp.pop();
            }
            if(temp.size()==0) nse[i]=n;
            else {
                nse[i]= temp.peek();
            }
            temp.push(i);
        }
        int max=-1;
        for (int i = 0; i <n ; i++) {
            int area = (nse[i]-pse[i]-1)*heights[i];
            max=Math.max(max,area);
        }
        System.out.println(max);
    }
}
