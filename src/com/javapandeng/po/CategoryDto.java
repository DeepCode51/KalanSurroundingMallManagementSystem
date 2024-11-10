package com.javapandeng.po;

import java.util.List;

/**
 * 一级类目和它的二级类目列表
 * 将一个父级分类和其下所有子级分类组合成一个DTO对象，以便在应用程序的各个层次中使用和传递。
 */
public class CategoryDto {

    private ItemCategory father;

    private List<ItemCategory> childrens;

    public ItemCategory getFather() {
        return father;
    }

    public void setFather(ItemCategory father) {
        this.father = father;
    }

    public List<ItemCategory> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<ItemCategory> childrens) {
        this.childrens = childrens;
    }
}
