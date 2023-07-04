public class Twofer {
    public String twofer(String name) {
        if(name == null){
            name = "you";
        }
            String _twofer = String.format("One for %s, one for me.", name);
            return _twofer;        
    }
}
