class qs2264 {
    public String largestGoodInteger(String num) {

        String answer = "";
        char control = ' ';

        for(int i = 1; i < num.length(); i++){

            if(num.charAt(i) == (num.charAt(i-1))){

                if(i != num.length()-1 && num.charAt(i+1) == (num.charAt(i))){
                    if(num.charAt(i) >= control){
                        answer = num.substring(i-1,i+2);
                        control = num.charAt(i);
                    }




                }
            }


        }

        return answer;

    }
}