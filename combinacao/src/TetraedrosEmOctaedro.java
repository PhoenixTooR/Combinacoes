public class TetraedrosEmOctaedro {
    // Função para calcular o número de tetraedros
    public static int calcularNumeroTetraedros() {
        // Vértices e centros de faces do octaedro
        int vertices = 6;
        int centrosDeFaces = 6;

        // Calcular as combinações
        int tetraedrosComVertices = CombinacaoUtil.combinacao(vertices, 4);
        int tetraedrosComCentros = CombinacaoUtil.combinacao(centrosDeFaces, 4);
        int tetraedrosCom3Vertices1Centro = CombinacaoUtil.combinacao(vertices, 3) * centrosDeFaces;
        int tetraedrosCom2Vertices2Centros = CombinacaoUtil.combinacao(vertices, 2) * CombinacaoUtil.combinacao(centrosDeFaces, 2);

        // Somar todas as combinações
        return tetraedrosComVertices + tetraedrosComCentros + tetraedrosCom3Vertices1Centro + tetraedrosCom2Vertices2Centros;
    }
}
