public class MinhaThreadComSleep extends Thread{

    String nome;

    public MinhaThreadComSleep(String nome){
        this.nome = nome;
        start();
    }
    
    public void run(){
        try {
            for(int i = 1; i <=10; i++){
                sleep(2000);  
                System.out.println("Thread "+ nome + ":" + i);
            }
        } catch (Exception e) {
            
        }
    }

}
