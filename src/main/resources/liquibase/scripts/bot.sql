--liquibase formatted sql

-- changeset GlakovaA:1
CREATE TABLE IF NOT EXISTS client_registration
(
    id                      BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    user_id                 BIGINT  NOT NULL,
    FNS                     TEXT NOT NULL,
    place_of_residence      TEXT NOT NULL
);
