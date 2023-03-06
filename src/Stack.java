public class Stack
{
    /**
     * Create a class called Stack. It should contain:
     * a. A class called Node. This should:
     * i. Be created within the same file as the Stack class.
     * ii. Be created as a private static class.
     * iii. Contain:
     ** 1. A String called data – The information to be stored in the stack.
     ** 2. A Node called next – This will point to the node after this one in the stack.
     ** 3. A constructor that takes a single parameter, a String representing the data to be
     ** stored. This constructor should store the incoming information in your data variable,
     ** and set your next node to null.
     * 4. A method called hasNext() that returns whether or not next == null.
     * b. An int called count or numElements – this will track how many elements are stored in the stack.
     * c. A Node called first – this will store the first element in the stack (initialized to null).
     */


    private static class Node
    {

        private String data;
        private Node next;

        /**
         * Constructor for creating a Node object.
         * @param value
         */
        public Node(String value)
        {
            this.data = value;
            this.next = null;
        }

        public Node(String data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }
    //     * 4. A method called hasNext() that returns whether or not next == null.

    public int hanNext(String value)
    {
        if (data == null)
        {
            return -1;
        }

        Node currentPos = firstPos;
        for (int i = 0; i < size(); i++)
        {
            if (value.equals(currentPos.data))
            {
                return i;
            }
            currentPos = currentPos.next;
        }
        return -1;
    }


}
