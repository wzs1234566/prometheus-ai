package es.api;

import java.util.Set;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import tags.Fact;
import tags.Recommendation;
import tags.Rule;

/**
 * Factory to create an Expert System (ES).
 */
public interface ExpertSystemFactory {
    /**
     * Creates the ES.
     *
     * @param readyRules      the ready rules of the ES
     * @param activeRules     the active rules of the ES
     * @param facts           the facts of the ES
     * @param recommendations the recommendations of the ES
     * @return the created ES
     */
    @Inject
    ExpertSystem create(
            @Assisted("readyRules") Set<Rule> readyRules,
            @Assisted("activeRules") Set<Rule> activeRules,
            @Assisted("facts") Set<Fact> facts,
            @Assisted("recommendations") Set<Recommendation> recommendations);
}
