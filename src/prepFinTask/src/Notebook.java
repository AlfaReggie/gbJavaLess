package prepFinTask.src;

import java.util.ArrayList;
import java.util.Arrays;

public class Notebook {

    private String name;
    private String processor;
    private int operation_memory;
    private String graphics_accelerator;
    private double screen_diagonal;
    private int hard_disk_space;
    private String operation_system;
    private String color;
    private String housing_material;
    private double price;

    private ArrayList<Object> list_param;

    ArrayList<String> name_param = new ArrayList<>(Arrays.asList("name", "processor",
            "graphics_accelerator", "operation_system", "color", "housing_material", "operation_memory",
            "hard_disk_space", "screen_diagonal", "price"));

    public Notebook(String name, String processor, int operation_memory, String graphics_accelerator,
                    double screen_diagonal, int hard_disk_space, String operation_system,
                    String color, String housing_material, double price) {

        this.name = name;
        this.processor = processor;
        this.operation_memory = operation_memory;
        this.graphics_accelerator = graphics_accelerator;
        this.screen_diagonal = screen_diagonal;
        this.hard_disk_space = hard_disk_space;
        this.operation_system = operation_system;
        this.color = color;
        this.housing_material = housing_material;
        this.price = price;

        list_param = new ArrayList<>(Arrays.asList(name, processor,
                graphics_accelerator, operation_system, color, housing_material,
                operation_memory, hard_disk_space, screen_diagonal, price));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list_param.size() - 1; i++) {
            stringBuilder.append(name_param.get(i) + ": " + list_param.get(i) + "\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notebook)) {
            return false;
        }
        Notebook notebook = (Notebook) obj;
        boolean result = false;
        for (int i = 0; i < list_param.size() - 1; i++) {
            if (list_param.get(i).equals(notebook.list_param.get(i))) {
                result = true;
            } else {
                return false;
            }
        }
        return result;
    }

    public String getProcessor() {
        return processor;
    }

    public Integer getOperation_memory() {
        return operation_memory;
    }

    public String getGraphics_accelerator() {
        return graphics_accelerator;
    }

    public Double getScreen_diagonal() {
        return screen_diagonal;
    }

    public Integer getHard_disk_space() {
        return hard_disk_space;
    }

    public String getOperation_system() {
        return operation_system;
    }

    public String getColor() {
        return color;
    }

    public String getHousing_material() {
        return housing_material;
    }

    public ArrayList<String> list_stringMetods() {
        ArrayList<String> metods_string = new ArrayList<>(Arrays.asList(getProcessor(), getGraphics_accelerator(),
                getOperation_system(), getColor(), getHousing_material()));
        return metods_string;
    }
    public ArrayList<Integer> list_intMetods() {
        ArrayList<Integer> metods_int = new ArrayList<>(Arrays.asList(getOperation_memory(), getHard_disk_space()));
        return metods_int;
    }
    public ArrayList<Double> list_floatMetods() {
        ArrayList<Double> metods_double = new ArrayList<>(Arrays.asList(getScreen_diagonal()));
        return metods_double;
    }
}
