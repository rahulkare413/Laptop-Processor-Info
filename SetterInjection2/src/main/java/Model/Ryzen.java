package Model;

public class Ryzen implements Processor{

    @Override
    public void processorInformation() {
        System.out.println("CORE SERIES IS I3");
        System.out.println("INTEL GENERATION IS 8GEN");
        System.out.println("INTEGRATED GRAPHICS IS ABCD ");
    }
}
