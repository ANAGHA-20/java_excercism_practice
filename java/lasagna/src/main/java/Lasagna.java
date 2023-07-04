public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        int _minutes_in_oven = 40;
        return _minutes_in_oven;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutes_passed) {
        int _minutes_in_oven = expectedMinutesInOven();
        int _remaining_minutes_in_oven = _minutes_in_oven - minutes_passed;
        return _remaining_minutes_in_oven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int number_of_layers){
        int no_of_minutes_per_layer = 2;
        return (no_of_minutes_per_layer * number_of_layers);
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int number_of_layers, int minutes_passed){
        int _prep_time = preparationTimeInMinutes(number_of_layers);
        return _prep_time + minutes_passed;
    }
}
