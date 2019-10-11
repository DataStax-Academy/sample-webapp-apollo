TRUNCATE evangelists.conferences;

// Voxxed Day Microservices
INSERT INTO evangelists.conferences(region, year, country, city, name, 
                    day_start, day_end, url, 
                    attendees, visitor_nb, topics, 
                    cfp_status, cfp_day_opening, cfp_day_closing, cfp_submission_url)
VALUES('SEMEA', 2018, 'FRANCE', 'Paris', 'Voxxed Day Microservices',  '2018-10-29', '2018-10-31', 'https://voxxeddays.com/microservices/', 
      {'Developer'}, 500, {'Development', 'Microservices'}, 'closed', '2018-04-15', '2018-05-31', 'https://vxdms2018.confinabox.com/cfp/home');

// Voxxed Day Ticino 2018
INSERT INTO evangelists.conferences(region, year, country, city, name, 
                    day_start, day_end, url, 
                    attendees, visitor_nb, topics, 
                    cfp_status, cfp_day_opening, cfp_day_closing, cfp_submission_url)
VALUES('SEMEA', 2018, 'SWITZERLAND', 'Lugano', 'Voxxed Day Ticino', 
       '2018-10-20', '2018-10-20', 'https://voxxeddays.com/ticino/', 
       {'Developer'}, 500, {'Development'}, 
       'OPENED', '2018-04-09', '2018-06-18', 'https://cfpvdt18.confinabox.com/');

// Voxxed Day Banff 2018
INSERT INTO evangelists.conferences(region, year, country, city, name, 
                    day_start, day_end, url, 
                    attendees, visitor_nb, topics, 
                    cfp_status, cfp_day_opening, cfp_day_closing, cfp_submission_url)
VALUES('NA', 2018, 'CANADA', 'Banff', 'Voxxed Day Banff',
       '2018-10-26', '2018-10-27', 'https://voxxeddays.com/banff/', 
       {'Developer'}, 250, {'Development'}, 
       'OPENED', '2018-05-23', '2018-06-30', 'https://banff2018.confinabox.com/');

// Confoo 2019
INSERT INTO evangelists.conferences(region, year, country, city, name, 
                    day_start, day_end, url, 
                    attendees, visitor_nb, topics)
VALUES('NA', 2019, 'CANADA', 'Montreal', 'Confoo',
       '2019-03-13', '2019-03-15', 'https://confoo.ca/en/yul2019', 
       {'Developer'}, 650, {'Development'});

// Data Day Texas 2019
INSERT INTO evangelists.conferences(region, year, country, city, name, sponsor,
                    day_start, day_end, url, 
                    attendees, topics)
VALUES('NA', 2019, 'USA', 'Austin', 'Data Day Texas', 'GeekAustin',
       '2019-01-26', '2019-01-27', 'https://10times.com/data-day-texas', 
       {'Developer', 'Architect'}, {'Data'});

// Voxxed Day Napoca 2018
INSERT INTO evangelists.conferences(region, year, country, city, name, 
                    day_start, day_end, url, 
                    attendees, topics, 
                    cfp_status, cfp_day_opening, cfp_day_closing, cfp_submission_url)
VALUES('SEMEA', 2018, 'ROMANIA', 'Cluj Napoca', 'Voxxed Day Napoca',
       '2018-11-22', '2018-12-22', 'https://romania.voxxeddays.com/cluj-napoca/2018-11-22/', 
       {'Developer'}, {'Development'}, 
       'OPENED', '2018-05-15', '2018-08-01', 'https://www.papercall.io/vdcluj2018');

// Dev Fest Nantes 2018
INSERT INTO evangelists.conferences(region, year, country, city, name, 
                    day_start, day_end, url, 
                    attendees, visitor_nb, topics, 
                    cfp_status, cfp_day_opening, cfp_day_closing, cfp_submission_url)
VALUES('SEMEA', 2018, 'FRANCE', 'Nantes', 'Dev Fest Nantes',
       '2018-10-18', '2018-10-19', 'https://devfest.gdgnantes.com/	', 
       {'Developer'}, 3600, {'Development'}, 
       'OPENED', '2018-05-15', '2018-07-01', 'https://cfp.gdgnantes.com/public/event/inzOQDR94h4bAaOVd7Db');

// Big Data Paris 2019
INSERT INTO evangelists.conferences(region, year, country, city, name, 
                    day_start, day_end, url, 
                    attendees, visitor_nb, topics)
VALUES('SEMEA', 2019, 'FRANCE', 'Paris', 'Big Data Paris',
       '2019-03-11', '2019-03-12', 'https://www.bigdataparis.com/',
       {'Architects', 'Benefactors'}, 15000, {'Big Data', 'Data'});

// Dev Fest 2018
INSERT INTO evangelists.conferences(region, year, country, city, name, 
                    day_start, day_end, url, 
                    attendees, visitor_nb, topics, cfp_status)
VALUES('SEMEA', 2018, 'FRANCE', 'Lille', 'Dev Fest Lille',
       '2018-06-21', '2018-06-21', 'https://devfest.gdglille.org/',
       {'Developer'}, 400, {'Development'}, 'CLOSED');
       
// Dot Scale 2018
INSERT INTO evangelists.conferences(region, year, country, city, name, 
                    day_start, day_end, url, 
                    attendees, visitor_nb, topics, cfp_status)
VALUES('SEMEA', 2018, 'FRANCE', 'Lille', 'Dot Scale',
       '2018-06-01', '2018-06-01', 'https://www.dotscale.io/',
       {'Architects'}, 250, {'Distributed Architectures'}, 'CLOSED');
       

// Dev Fest Toulouse 2018
INSERT INTO evangelists.conferences(region, year, country, city, name, 
                    day_start, day_end, url, 
                    attendees, visitor_nb, topics, 
                    cfp_status, cfp_day_opening, cfp_day_closing, cfp_submission_url)
VALUES('SEMEA', 2018, 'FRANCE', 'Toulouse', 'Dev Fest Toulouse',
       '2018-09-11', '2018-09-11', 'https://devfesttoulouse.fr', 
       {'Developer'}, 600, {'Development'}, 
       'OPENED', '2018-05-15', '2018-07-01', 'https://devfest-toulouse.cfp.io/#/dashboard');

// Codeur en Seine 2018
INSERT INTO evangelists.conferences(region, year, country, city, name, 
                    day_start, day_end, url, 
                    attendees, visitor_nb, topics, 
                    cfp_status, cfp_day_opening, cfp_day_closing, cfp_submission_url)
VALUES('SEMEA', 2018, 'FRANCE', 'Rouen', 'Codeur en Seine',
       '2018-11-22', '2018-11-2', 'https://www.codeursenseine.com/2018', 
       {'Developer'}, 800, {'Development'}, 
       'OPENED', '2018-06-01', '2018-08-31', 'https://codeursenseine.cfp.io/#/dashboard');

// BreizhCamp 2019
INSERT INTO evangelists.conferences(region, year, country, city, name, 
                    day_start, day_end, url, 
                    attendees, visitor_nb, topics)
VALUES('SEMEA', 2019, 'FRANCE', 'Rennes', 'BreizhCamp',
       '2019-03-21', '2019-03-22', 'http://www.breizhcamp.org',
       {'Developer', 'Architects'}, 1000, {'Development'});
       
// Riveira Dev 2019
INSERT INTO evangelists.conferences(region, year, country, city, name, 
                    day_start, day_end, url, 
                    attendees, visitor_nb, topics)
VALUES('SEMEA', 2019, 'FRANCE', 'Sophia Antipolis', 'Riveira Dev',
       '2019-05-01', '2019-05-31', 'http://rivieradev.fr',
       {'Developer'}, 500, {'Development'});
       
// Big Data LA 2018
INSERT INTO evangelists.conferences(region, year, country, city, name, 
                    day_start, day_end, url, 
                    attendees, visitor_nb, topics, 
                    cfp_status, cfp_day_opening, cfp_day_closing, cfp_submission_url)
VALUES('NA', 2018, 'USA', 'Los Angeles', 'Big Data LA',
       '2018-08-11', '2018-08-11', 'https://www.bigdatadayla.com',
       {'Developer', 'Architects', 'Benefactors'}, 2000, {'Big Data', 'Data'}, 
        'OPENED', '2018-05-01', '2018-06-15', 'https://docs.google.com/forms/d/e/1FAIpQLScQpbjiX9zOOaP8mVemhmT-6iQdSAc52Qc8gW57TQe3aakhZw/viewform');

// Open Source Summit 2018
INSERT INTO evangelists.conferences(region, year, country, city, name, 
                    day_start, day_end, url, 
                    attendees, visitor_nb, topics)
VALUES('SEMEA', 2018, 'FRANCE', 'Paris', 'Open Source Summit',
       '2018-12-05', '2018-12-06', 'http://www.opensourcesummit.paris',
       {'Developer'}, 500, {'Open Source'});
