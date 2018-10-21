package net.firestaff.mcp.baselab.shapes.zaxis;

public abstract class AbstractZShape implements ZShape{

    protected String name;

    public String getName() {
        return name;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof ZShape)) return false;
        return equals((ZShape)obj);
    }

    public boolean equals(ZShape shape) {
        if(shape.getName().equalsIgnoreCase(this.name)) return true;
        return false;
    }
}
