public class Architecture {
    private int mHeight;
    private int mWidth;
    private int mFloor;

    private Architecture(int height, int width, int floor) {
        mHeight = height;
        mWidth = width;
        mFloor = floor;
    }

    public void show() {
        System.out.println("Height: " + mHeight + ", Width: " + mWidth + ", Floor: " + mFloor);
    }

    public static class Builder {
        private int mHeight;
        private int mWidth;
        private int mFloor;

        public Builder() {
        }

        public Builder setHeight(int height) {
            this.mHeight = height;
            return this;
        }

        public Builder setWidth(int width) {
            this.mWidth = width;
            return this;
        }

        public Builder setFloor(int floor) {
            this.mFloor = floor;
            return this;
        }

        public Architecture build() {
            return new Architecture(this.mHeight, this.mWidth, this.mFloor);
        }
    }
}