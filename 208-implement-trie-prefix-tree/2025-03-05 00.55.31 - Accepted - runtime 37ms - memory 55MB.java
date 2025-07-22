class Trie {
    static class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children=new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    Node root=new Node();
    
    public void insert(String word) {
        Node curr= root;
        for(int i=0;i<word.length();i++){
        int idx=word.charAt(i)-'a';
        if(curr.children[idx]==null){
            curr.children[idx]=new Node();
        }
        
        if(i==word.length()-1){
            curr.children[idx].eow=true;
        }
        curr=curr.children[idx];
        }
    }
    
    public boolean search(String key) {
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx = key.charAt(i)-'a';

            if(curr.children[idx]==null) return false;

            if(i==key.length()-1 && curr.children[idx].eow==false){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    
    public boolean startsWith(String prefix) {
        if(prefix.length()==0) return true;
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';

            if(curr.children[idx]==null) return false;
            curr=curr.children[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */