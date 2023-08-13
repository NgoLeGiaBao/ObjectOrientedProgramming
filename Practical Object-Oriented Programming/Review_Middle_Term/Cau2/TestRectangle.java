class TestRectangle {
    public static void main(String[] args){
        Rectangle rec = new Rectangle("Ruby", "Red", 6, 8);
        System.out.println(rec.calDiagonalLine());        
        //In loai hinh chu nhat        
        System.out.println(rec.getType());
        //In thong tin
        System.out.println(rec.toString());
        System.out.println(rec.resize(1.5));
        //SV tu kiem tra them cac phuong thuc khac
    }
}
