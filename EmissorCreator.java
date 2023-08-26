public class EmissorCreator{
    static int SMS = 1;
    static int EMAIL = 2;
    static int PUSH = 3;
   
    public Emissor create(int tipoEmissor){
        if(tipoEmissor == SMS){
            return new EmissorSMS();
        }else if(tipoEmissor == EMAIL){
            return new EmissorEmail();
        }else if(tipoEmissor == PUSH){
            return new EmissorPush();
        }else{
            throw new IllegalArgumentException("TIPO INVALIDO");
        }
       
    }
   
}
