class ResistorColor {
    int colorCode(String color) {
        String[] color_array = colors();
        int i = -1;
        for(i=0; i < color_array.length; i++){
            if(color_array[i].equalsIgnoreCase(color)){
                break;
            }
        }
        return i;
    }

    String[] colors() {
        String[] color_array = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return color_array;
    }
}
