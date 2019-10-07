package com.runsim.backend.otn;

import java.util.ArrayList;
import java.util.Arrays;

public class OtnTuple extends OtnElement {
    private final ArrayList<OtnElement> elements;

    public OtnTuple() {
        this.elements = new ArrayList<>();
    }

    public OtnTuple(OtnElement... elements) {
        this.elements = new ArrayList<>();
        this.elements.addAll(Arrays.asList(elements));
    }

    public OtnTuple add(OtnElement element) {
        elements.add(element);
        return this;
    }

    public OtnTuple add(int element) {
        elements.add(new OtnNumber(element));
        return this;
    }

    public OtnTuple add(float element) {
        elements.add(new OtnNumber(element));
        return this;
    }

    public OtnTuple add(String element) {
        elements.add(new OtnString(element));
        return this;
    }

    public int size() {
        return elements.size();
    }

    public OtnElement get(int index) {
        return elements.get(index);
    }

    public void set(int index, OtnElement element) {
        elements.set(index, element);
    }

    @Override
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"type\": \"tuple\",\"value\":[");
        for (int i = 0; i < size(); i++) {
            sb.append(get(i).toJson());
            if (i != size() - 1)
                sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}