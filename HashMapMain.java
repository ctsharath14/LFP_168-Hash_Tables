public class HashMapMain {

    public static void main(String[] args) {

        //printing welcome message
        System.out.println("Welcome to Hash Table Program.\n");
        MyMapNode mapNode = new MyMapNode();

        //Using mapNode object to call MyMapNode function
        mapNode.frequencyWord();
        mapNode.findWordFrequencyLargeParagraph();
        mapNode.removeWordAvoidable();

    }

}