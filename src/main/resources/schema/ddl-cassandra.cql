CREATE KEYSPACE IF NOT EXISTS evangelists WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };

CREATE TABLE IF NOT EXISTS evangelists.conferences (
    region      text,
    year        int,
    country     text,
    city        text,
    name        text,
    day_start   date,
    day_end     date,
    url         text,
    attendees   set <text>,
    visitor_nb  int,
    topics      set <text>,
    sponsor     text,
    cfp_status      text,
    cfp_day_opening date,
    cfp_day_closing date,
    cfp_submission_url text,
    PRIMARY KEY ((region, year), day_start, name)
) WITH CLUSTERING ORDER BY (day_start ASC, name ASC);

