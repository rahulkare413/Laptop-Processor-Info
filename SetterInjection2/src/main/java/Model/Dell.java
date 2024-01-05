package Model;

public class Dell implements Laptop{
    private Processor processor;

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public void laptopInfo() {
        System.out.println("LAPTOP NAME IS DELL ");
        System.out.println("LAPTOP RAM IS 16 GB ");
        System.out.println("STORAGE CAPACITY IS 512 SDD ");
    }

    @Override
    public void processorInformation() {
        processor.processorInformation();

    }
}
