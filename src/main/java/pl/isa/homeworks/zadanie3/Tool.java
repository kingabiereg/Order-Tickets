package pl.isa.homeworks.zadanie3;

public class Tool {
    private String name;
    private ToolSize toolSize;

    public Tool(String name, ToolSize size) {
        this.name = name;
        this.toolSize = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ToolSize getToolSize() {
        return toolSize;
    }

    public void setToolSize(ToolSize toolSize) {
        this.toolSize = toolSize;
    }

    public record ToolSize(float size, String unit) {
    }
}
