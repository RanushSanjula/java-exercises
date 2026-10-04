public class largestNum {
    public static void main(String[] args) {

int[] num = {1,2,10,9,5};
int largest = num[0];

for(int i=1;i<num.length;i++){
if(num[i]>largest){
    largest=num[i];
}
}

System.out.println("largest number:"+largest);

    }
}
