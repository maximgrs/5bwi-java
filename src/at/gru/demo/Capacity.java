package at.gru.demo;

public enum Capacity {
    SIZE_2GB(2),
    SIZE_4GB(4),
    SIZE_8GB(8),
    SIZE_16GB(16),
    SIZE_32GB(32),
    SIZE_64GB(64),
    SIZE_128GB(128),
    SIZE_256GB(256),
    SIZE_512GB(512),
    SIZE_1024GB(1024);

    private int sizeInGB;

    // Konstruktor des Enums
    Capacity(int sizeInGB) {
        this.sizeInGB = sizeInGB;
    }

    // Getter für die Größe in GB
    public int getSizeInGB() {
        return sizeInGB;
    }
}
