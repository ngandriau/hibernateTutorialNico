@GenericGenerator(
        name = "ID_GENERATOR",
        strategy = "enhanced-sequence",
        parameters = {
                @Parameter(
                        name = "sequence_name",
                        value = "JPWH_SEQUENCE"
                )
        })

@org.hibernate.annotations.NamedQueries({
        @org.hibernate.annotations.NamedQuery(
                name = "findEventsWithTitleOrderByDate",
                query = "SELECT e FROM Event e WHERE e.title LIKE :titleP ORDER BY e.date ASC"
        )})

package nico.hibernate.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


