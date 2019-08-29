package com.michelfigueiredo.kata.micro.arrayleftrotation;

class ArrayLeftRotation {

    static int[] rotate(int[] array, int rotationsCount) {
        int[] elementsToRotate = new int[array.length];
        int[] rotatedElements = new int[array.length];

        System.arraycopy(array, 0, elementsToRotate, 0, array.length);

        for (int i = 0; i < rotationsCount; i++) {
            int lastElementIndex = elementsToRotate.length - 1;
            rotatedElements[lastElementIndex] = elementsToRotate[0];
            for (int j = lastElementIndex; j > 0; j--) {
                rotatedElements[j - 1] = elementsToRotate[j];
            }
            System.arraycopy(rotatedElements, 0, elementsToRotate, 0, rotatedElements.length);
        }


        return rotatedElements;
    }
}
