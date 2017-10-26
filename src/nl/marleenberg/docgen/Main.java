package nl.marleenberg.docgen;

import nl.marleenberg.math.MathUtils;

public class Main {
    public static void main(String[] args) {

        // TODO: Process the MathUtils class's annotations
        DocProcessor.process(MathUtils.class);

    }
}