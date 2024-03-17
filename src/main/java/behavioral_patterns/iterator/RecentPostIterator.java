package behavioral_patterns.iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecentPostIterator implements Iterator<Post> {

    private Iterator<Post> internalIterator;

    public RecentPostIterator(Board board) {
        List<Post> posts = board.getPosts();
        posts.sort((o1, o2) -> o2.getCreatedDateTime().compareTo(o1.getCreatedDateTime()));
        this.internalIterator = posts.iterator();
    }

    @Override
    public boolean hasNext() {
        return internalIterator.hasNext();
    }

    @Override
    public Post next() {
        return internalIterator.next();
    }

}
