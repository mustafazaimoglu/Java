public class Tester 
{
    public static void main(String[] args) 
    {
        Resolution resolution1 = new Resolution("360", "640");
        Resolution resolution = new Resolution("1080", "1920");
        Monitor monitor = new Monitor("Asus Rog", "23\'", resolution);
        Anakart anakart = new Anakart("MSİ", "15", 16, "AMD");
        Kasa kasa = new Kasa("Cooler Master", "Titanyum", 10);
        
        Computer computer = new Computer(kasa, monitor, anakart);
        
        computer.getMonitor().MonitorKapa();
        
        computer.getAnakart().RamEkle(8);
        
        System.out.println();
        computer.getMonitor().Information();
        
        computer.getMonitor().ModelDegistir("Dell");
        
        System.out.println();
        computer.getMonitor().Information();
        
        computer.getMonitor().setResolution(resolution1);
        
        System.out.println();
        computer.getMonitor().Information();
        
        computer.getMonitor().setBoyut("27\'");
        
        System.out.println();
        computer.getMonitor().Information();
        
        computer.getAnakart().RamEkle(8);
   
    }
    
}
