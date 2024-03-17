public class StrukturList {
    private Node HEAD;

    // algoritma fungsi addHead
    public void addHead(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    // algoritma fungsi addMid
    public void addMid(int data, int position) {
        Node newNode = new Node(data);
        Node curNode = null;
        Node posNode = null;
        int i;

        if (isEmpty()) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            if (position == 1) {
                newNode.setNext(curNode);
                HEAD = newNode;
            } else {
                i = 1;
                while ((curNode != null) && (i < position)) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }

    // algoritma fungsi addTail
    public void addTail(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node posNode = null;
            Node curNode = HEAD;

            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }

            posNode.setNext(newNode);
        }
    }

    private boolean isEmpty() {
        return HEAD == null;
    }

    // fungsi dispose
    public void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }

    // algoritma fungsi removeHead
    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    // algoritma fungsi removeMid
    public void removeMid(int e) {
        Node preNode = new Node(0);
        Node tempNode = HEAD;
        boolean ketemu = false;
        int i = 1;

        if (isEmpty()) {
            System.out.println("Elemen list kosong");
        } else {
            while (tempNode != null && !ketemu) {
                if (tempNode.getData() == e) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            if (ketemu) {
                if (i == 1) {
                    HEAD = null;
                } else {
                    preNode.setNext(tempNode.getNext());
                    dispose(tempNode);
                }
            }
        }
    }

    // algoritma fungsi removeTail
    public void removeTail() {
        Node preNode = null;
        Node lastNode;

        if (HEAD != null) {
            if (HEAD.getNext() == null) {
                HEAD = null;
            } else {
                lastNode = HEAD;
                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
                preNode.setNext(null);
                dispose(lastNode);
            }
        }
    }

    // Display elements list
    public void displayElement() { 
		Node curNode = HEAD;
		
        if(curNode == null){
            System.out.println("\n List Kosong");
        }
		while(curNode != null) {
			System.out.print(curNode.getData()+ " ");
			curNode = curNode.getNext();
		}
	}

    // algoritma fungsi find
    public boolean find(int x)
    {
        Node curNode = HEAD;
        boolean ketemu = false;

        while (curNode != null && !ketemu) 
        {
            if (curNode.getData() == x)
                ketemu = true;
            else
                curNode = curNode.getNext();
        }
        return ketemu;
        /*
            * mencari nilai x dalam linked list, dimulai dari curNode awal (HEAD). 
            * Selama curNode tidak kosong dan nilai x belum ditemukan, 
            * program akan terus mencari. Jika nilai x ditemukan, 
            * fungsi mengembalikan true, jika tidak, mengembalikan false.
         */
    }

    // algoritma fungsi size
    public int size() 
    {
        Node curNode = HEAD;
        int jumlah = 0;
        while (curNode != null) 
        {
            jumlah++;
            curNode = curNode.getNext();
        }
    return jumlah;
    /*
        * Setiap curnode akan menambahkan satu pada totalnya, sehingga di akhir perhitungan, 
        * totaljumlahnya akan sama dengan jumlah simpul yang ada.
    */
    }

    // algoritma fungsi removeAll
    void removeAll() {
        HEAD = null;
    }
}


