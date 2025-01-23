class wrapper
{
    public static void main(String args[])
    {
        byte b=10;
        short s=20;
        int i=30;

        Byte byteobj=b;
        Short shortobj=s;
        int intobj=i;

        System.out.println("byteobj: " + byteobj);
        System.out.println("shortobj: " + shortobj);
        System.out.println("intobj: " + intobj);

        byte bytevalue=byteobj;
        short shortvalue=shortobj;
        int intvalue=intobj;

        System.out.println("byte value: " + bytevalue);
        System.out.println("short value: " + shortvalue);
        System.out.println("int value: " + intvalue);
    }
}
