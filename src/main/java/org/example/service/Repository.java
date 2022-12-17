package org.example.service;

import org.example.data.Figure;

import java.lang.reflect.Field;

public interface Repository <T extends Figure>{
    public void add(T value);
}
