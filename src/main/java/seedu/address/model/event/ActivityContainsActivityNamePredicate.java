package seedu.address.model.event;

import java.util.List;
import java.util.function.Predicate;

/**
 * Tests that a {@code Person}'s {@code Name} matches any of the keywords given.
 */
public class ActivityContainsActivityNamePredicate implements Predicate<Event> {
    private final List<String> keywords;

    public ActivityContainsActivityNamePredicate(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public boolean test(Event event) {
        return keywords
                .stream()
                .anyMatch(keyword -> keywords.contains(event.getActivity()));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof ActivityContainsActivityNamePredicate // instanceof handles nulls
                && keywords.equals(((ActivityContainsActivityNamePredicate) other).keywords)); // state check
    }
}
