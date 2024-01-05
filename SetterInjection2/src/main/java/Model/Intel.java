package Model;

public class Intel implements Processor{

    @Override
    public void processorInformation() {
        System.out.println("CORE SERIES IS I5");
        System.out.println("INTEL GENERATION IS 10GEN");
        System.out.println("INTEGRATED GRAPHICS IS NVIDIA ");
    }
}
