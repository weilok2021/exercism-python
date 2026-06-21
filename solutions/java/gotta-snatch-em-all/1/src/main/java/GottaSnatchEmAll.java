import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.size() == 0 || theirCollection.size() == 0) {
            return false;
        } 
        
        boolean theyDoNotHaveMyCard = false;
        for (String myCard: myCollection) {
            // if they do not have my card, they need my card
            if (!theirCollection.contains(myCard)) {
                theyDoNotHaveMyCard = true;
                break;
            }
        }
        for (String theirCard: theirCollection) {
            // if they have card I do not have, and they do not have my card
            if (!myCollection.contains(theirCard) && theyDoNotHaveMyCard) {
                return true;
            }
        }
        return false;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonSet = new HashSet<>(collections.get(0));
        for (int i = 1; i < collections.size(); i++) {
            commonSet.retainAll(collections.get(i));
        }
        return commonSet;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCollections = new HashSet<>();
        for (Set<String> collection: collections) {
            allCollections.addAll(collection);
        }
        return allCollections;
    }
}
