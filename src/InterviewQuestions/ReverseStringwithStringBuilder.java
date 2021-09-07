package InterviewQuestions;

public class ReverseStringwithStringBuilder {
    public static void main(String[] args) {

        String str="Hello World";

        StringBuilder sb=new StringBuilder(str);

        System.out.println(sb.reverse());

    }
}
