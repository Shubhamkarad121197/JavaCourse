
enum Status{
    SUCCESS("Operation Successful"),
    FAILURE("Operation Failure");

    String message;

    Status(String message){
        this.message=message;
    }

    void showMessage(){
        System.out.println(message);
    }
}

class EnumClass {
    public static void main(String args[]){
            Status s=Status.SUCCESS;

            System.out.println(s);
            s.showMessage();

            for (Status st : Status.values()) {
            System.out.println(st + " : " + st.ordinal());
        }
    }
}
