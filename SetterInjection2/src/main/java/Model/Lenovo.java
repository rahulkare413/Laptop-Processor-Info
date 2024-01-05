package Model;

public class Lenovo implements Laptop{
    private Processor processor;

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public void laptopInfo() {
        System.out.println("LAPTOP NAME IS LENOVO ");
        System.out.println("LAPTOP RAM IS 12 GB ");
        System.out.println("STORAGE CAPACITY IS 1TB SDD ");

    }

    @Override
    public void processorInformation() {
        processor.processorInformation();

    }
}
