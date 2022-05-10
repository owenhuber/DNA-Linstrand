public class LinkStrand implements IDnaStrand {
    // Owen Huber 
    // Chris Hillen

    //our Node class
    private class Node {
        String info;
        Node next;
   
        public Node(String s, Node n) {
             info = s;
             next = n;
        }
   }
   
   // Testing to see push
   // our initialized values
   private Node myFirst, myLast;
   private long mySize;
   private int myAppends;
   private int myIndex;
   private Node myCurrent;
   private int myLocalIndex;
   
   //our first two constructors
   public LinkStrand(){
        this("");
}
    public LinkStrand(String s) {
        initialize(s);
}

    @Override
    public long size() {
        // DONE Auto-generated method stub
        return mySize;
    }

    @Override
    public void initialize(String source) {
        // DONE Auto-generated method stub
        myFirst = new Node(source, null);
        myLast = myFirst;
        mySize = source.length();
        myAppends = 0;
        myIndex = 0;
        myLocalIndex = 0;
        myCurrent = myFirst;
    }

    @Override
    public IDnaStrand getInstance(String source) {
        // DONE Auto-generated method stub
        return new LinkStrand(source);
    }

    @Override
	public String toString() {
        // DONE
        Node thePointer = myFirst;
        StringBuilder ourStringBuilder = new StringBuilder();
        while (thePointer != null){
            String useThis = thePointer.info;
            ourStringBuilder.append(useThis);
            thePointer = thePointer.next;
        }
        String ret = ourStringBuilder.toString();
		return ret;
	}


    @Override
    public IDnaStrand append(String dna) {
        // DONE Auto-generated method stub
        myLast.next = new Node(dna, null);
        myLast = myLast.next;
        myAppends += 1;
        mySize += dna.length();
        return this;
    }

    @Override
    public int getAppendCount() {
        // DONE Auto-generated method stub
        return myAppends;
    }

    @Override
    public IDnaStrand reverse() {
        // TODO Auto-generated method stub
        LinkStrand returned = null;
        Node pointer = myFirst;
        while (pointer != null){
            
        }
        
        return null;
    }

    @Override
    public char charAt(int index) {
        // TODO Auto-generated method stub
        return 0;
    }

}