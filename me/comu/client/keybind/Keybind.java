package me.comu.client.keybind;

import me.comu.api.interfaces.Labeled;

public abstract class Keybind implements Labeled
{
    private final String label;
    private int key;

    public Keybind(String label, int key)
    {
        this.label = label;
        this.key = key;
    }

    @Override
    public String getLabel()
    {
        return label;
    }

    public int getKey()
    {
        return key;
    }

    public void setKey(int key)
    {
        this.key = key;
    }

    public abstract void onPressed();
}
