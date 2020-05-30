package com.example.javacancy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class JavacancyApplicationTest {

    JavacancyApplication app;

    @Before
    public void before(){
        app = new JavacancyApplication(null, null, new VacancyRepository() {

            List<Vacancy> vacancies = new ArrayList<>();

            @Override
            public <S extends Vacancy> S save(S s) {
                vacancies.add(s);
                return s;
            }

            @Override
            public <S extends Vacancy> Iterable<S> saveAll(Iterable<S> iterable) {
                return null;
            }

            @Override
            public Optional<Vacancy> findById(Integer integer) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Integer integer) {
                return false;
            }

            @Override
            public Iterable<Vacancy> findAll() {
                return vacancies;
            }

            @Override
            public Iterable<Vacancy> findAllById(Iterable<Integer> iterable) {
                return null;
            }

            @Override
            public long count() {
                return vacancies.size();
            }

            @Override
            public void deleteById(Integer integer) {

            }

            @Override
            public void delete(Vacancy vacancy) {

            }

            @Override
            public void deleteAll(Iterable<? extends Vacancy> iterable) {

            }

            @Override
            public void deleteAll() {

            }
        });

        app.vacancyRepository.save(new Vacancy("Senior Software Developer (Java)", "ABB", Location.Stavanger, Experience.Senior, 880000, "Requires a bachelor’s or foreign equivalent degree in computer science, engineering, or a related field and 8 years of experience in the position offered or 8 years of experience developing software with at least one of the following software development models: Waterfall, Iterative, Agile, BDD, or Dev Ops. Also requires 5 years of experience: programming with Java Swings; programming with application tools for Open JMS (Apache ActiveMQ); programming with at least one of the following databases: Oracle DBMS with PL/SQL, SQL Server or MySql; working with at least one of the following web service languages: XML, XSD, or WSDL; working with at least one of the following web application assets: HTML, XML/XSL Technologies, JavaScript, JSP/Servlets or CSS; developing with Java and J2EE; using at least one of the messaging tools and integration tools: Tibco, Websphere, ActiveMQ, or RabbitMQ; developing with .net, C#, VB.net, Java and Eclipse on Visual Studio; and working on Unix/Linux operating system. Requires 3 years of experience: programming with SOAP based or Rest Easy Framework web services; developing with object oriented design and programming; installing and configuring web servers for WebTier and Apache Tomcat; using at least one of the following defect tracking assets: VersionOne, TFS, or ClearQuest; and using Clearcase or Team Foundation Server source control assets. Requires 2 years of experience working with products integrated with SCADA system. Experience may be, but need not be, acquired concurrently."));
        app.vacancyRepository.save(new Vacancy("Software Engineer", "KVH Industries", Location.Oslo, Experience.Entry, 447000, "We are looking for an experienced Software Engineer to join our technology team who will be working on our Next Generation VSAT project. You will be developing, configuring, and packaging software in a hybrid-cloud and embedded systems environment. You will be managing and deploying software to devices over satellite communications. You will be working on a dynamic team practicing scrum and open source development methodologies."));
        app.vacancyRepository.save(new Vacancy("Java Developer", "Sportradar", Location.Bergen, Experience.Senior, 890000, "As a Full Stack Java Software Developer, you will participate in development of the core Sportradar product and services. Currently we are looking for developers within the fields of core live odds services, trading, scout planning and core backend systems. Our systems are daily used by thousands of users and handle millions of transactions. You will work in a small team of highly motivated developers and to a large degree, influence what tasks you will be assigned to and how the team should collaborate. You will be assigned to a team based on your own interest and experience. Development is mainly done in Java, but experience with other tools like JavaScript or PHP is a plus since our strategy is to use the most efficient tools depending on the situation. Our teams work closely with other development teams in Norway, Europe andUS. We have recently initiated new projects within several areas to take advantage of the flexibility and scalability of cloud services like AWS and Azure. This includes several training programs within cutting edge technologies for our employees."));
        app.vacancyRepository.save(new Vacancy("Java Software Utvikler", "Jefferson Frank", Location.Bergen, Experience.Entry, 880000, "Ønsker du en arbeidsplass hvor kultur blant medarbeidere er satt i fokus? En organisasjon som er godt kjent blant det Norske folk, med over 2 millioner brukere over hele landet ser etter deres nye Java (med mulighet for fullstack) utvikler til deres team. Dette er et inhosue produkt hus som gjør viktig arbeid for data sikkerheten til deres kunder, plattformen deres blir brukt til å beskytte mot ID, data og dokumentasjons tyveri samt scams. Produktet deres er essensielt en del av hele Norges IT infrastruktur."));
        app.vacancyRepository.save(new Vacancy("Full Stack Java Developer", "The Sportsman Media Holding", Location.Bergen, Experience.Senior, 780000, "As a Full Stack Java Developer you will participate in the development of core Sportradar systems. We are working on a several projects including scout applications for live sports, aggregation of data and information feeds to our customers, worldwide. Check our web pages and videos to get an overview of product and services we deliver. We are recruiting both senior and junior developers."));
        app.vacancyRepository.save(new Vacancy("Software Engineer", "Everbridge", Location.Bergen, Experience.Senior, 950000, "Everbridge: a fast-growing global provider of SaaS-based critical communications and enterprise safety solutions currently have a fantastic opportunity for Software Engineer to be based in one of our Norwegian offices: Oslo, Stavanger/Sandnes or Bergen**."));
        app.vacancyRepository.save(new Vacancy("Software Engineer", "Cognite", Location.Oslo, Experience.Entry, 280000, "Do you care about craftsmanship and quality? At Cognite you will be encouraged and supported in writing high-quality, testable and readable code. We create applications that impact some of the biggest, most challenging industries today, and we experiment with making the applications that will change the way industries operate tomorrow."));
        app.vacancyRepository.save(new Vacancy("Java Developer", "piano.io", Location.Oslo, Experience.Entry, 430000, "Piano is a fast-growing enterprise SaaS company with operations in Oslo, London, New York City, Philadelphia, Russia, Amsterdam, Tokyo and elsewhere globally. We provide technology to the world’s leading media companies, including NBC Universal, the Economist, Condé Nast, Techcrunch, Bloomberg, Wall Street Journal, and Hearst. Our software enables these companies to create customized digital experiences for users, restrict and sell access to content online, and analyse user behavior in order to drive engagement, loyalty, and revenue. The analytics platform with engineering development centre in Oslo is the big data foundation of several experience products that cater for publishers’ need to increase visitor engagement and monetize their content through subscriptions and ads. The platform has at its core a high-performance time-series database, developed and maintained in-house, that powers analytics and experiences for ~7,000 websites, interacting with more than 2 billion devices. The database and applications are operated out of five data centers globally. Piano acquired Cxense ASA in November 2019."));
        app.vacancyRepository.save(new Vacancy("Java Backend Developer", "Aker Solutions", Location.Oslo, Experience.Entry, 450000, "We are looking for a curious and collaborative Backend/Fullstack Developer that is passionate about writing high-quality, testable and readable code. The selected candidate will be part of a growing software house in Egersund."));
        app.vacancyRepository.save(new Vacancy("Senior/Junior Java Backend Developer", "Sportradar", Location.Oslo, Experience.Entry, 600000, "As a Java Backend Developer you will participate in development of Sportradar's services on various platforms, this includes both new development and maintenance and you will be working on developing Java microservices that need to handle millions of updates per day. We are currently developing the next generation bookmaker tool, and for this project we need developers with a burning interest for Java development and with competence in Kubernetes, AWS, RabbitMQ, Kafka, REST and NoSQL"));
        app.vacancyRepository.save(new Vacancy("Software Engineer", "Cegal", Location.Oslo, Experience.Senior, 680000, "This is a great opportunity to progress your career with a growing, multi-national company, whilst learning and being mentored by Cegals experienced and talented engineers. We value our staff highly, and always look to develop skills and offer appropriate training. You will be a key part of the team and the company, and you will be encouraged to offer new ideas and alternative solutions in a supportive environment."));
        app.vacancyRepository.save(new Vacancy("Software Engineer Intern", "Oracle", Location.Oslo, Experience.Mid, 580000, "The interns will be working as software engineers in one of the MySQL Server development teams. Tasks will typically be prototyping and writing production code to extend MySQL with new functionality. Several of the new features in MySQL 5.7 and 8.0 have been implemented by students during internships."));
        app.vacancyRepository.save(new Vacancy("Software Engineer", "Spacemaker", Location.Oslo, Experience.Mid, 550000, "As Software Engineer at Spacemaker, you will be working in a complex domain. In a team you will be responsible for bringing and presenting the output from our AI to our end users. Using a wide range of technologies, including web-based 3D visualization tools, machine learning, and data processing frameworks, your work will enable our users to find the best possible solutions and gain valuable insights. You will work in multidisciplinary and autonomous teams, where decisions are made using a bottom-up approach. We believe that the people best equipped to determine an approach for a specific problem are the same people working hands-on with that very challenge every day."));
        app.vacancyRepository.save(new Vacancy("Graduate Software Engineer", "Cisco Systems", Location.Oslo, Experience.Senior, 770000, "Cisco Norway is a world leader in developing collaboration and video conferencing technology. We are 350 engineers who design all parts of our products – from hardware to software to industrial design. We take pride in our culture of innovation, inclusion and diversity. And now, we are growing! Most of our engineers are working with software development (C, C++, Full Stack Java, Python, Linux and embedded). We are all passionate about product development and programming and now we are kicking off the search for our new Graduate Software Engineers to strengthen our team. These roles will be working within a wide range of disciplines - to create our new video conferencing devices."));
        app.vacancyRepository.save(new Vacancy("Summer Internship 2020", "Arundo Analytics", Location.Oslo, Experience.Entry, 380000, "Arundo is a software company based in Oslo, Norway; Houston, TX; and Palo Alto, CA, with presence in 7 locations in Europe and the Americas. Our software enables advanced analytics, machine learning, and IoT applications for more efficient, safer, and more effective physical systems in heavy industries such as energy, chemicals, and shipping. Founded in 2015, Arundo currently consists of around 100 software engineers, data scientists, designers, and industrial domain experts."));
        app.vacancyRepository.save(new Vacancy("Software Engineer (Trondheim)", "Tapad", Location.Trondheim, Experience.Entry, 460000, "We are currently looking for a Full Stack Software Engineer to bring their approach to our global engineering center in Trondheim, Norway. We need a person who can work hands-on as a programmer to solve complex problems and to build advanced software systems. We face daily unique and engaging challenges while processing petabytes in any 60-day time frame—that is over one trillion data points, and all privacy safe. The size and scale of our challenges demand our use of cutting edge open-source technologies like Apache Spark, Apache Beam, Kubernetes, and we're proud to have been built on Scala from day one. Tapad operates on a culture of collaboration, so our Engineers regularly work with the Business and Engineering teams to guarantee we are delivering the best products. We believe our Engineers have an obligation to dissent and discuss. A successful Tapad engineer understands that their ideas hold weight, and they contribute freely and regularly. We want someone motivated to find large scale solutions with us. Tapad employees work with big data in a small team, where every contribution matters."));
        app.vacancyRepository.save(new Vacancy("Forward Deployed Software Engineer", "Palantir Technologies", Location.Trondheim, Experience.Entry, 390000, "At Palantir, we’re passionate about building software that solves problems. We partner with the most important institutions in the world to transform how they use data and technology. Our software has been used to stop terrorist attacks, discover new medicines, gain an edge in global financial markets, and more. If these types of projects excite you, we'd love for you to join us."));
        app.vacancyRepository.save(new Vacancy("Lead Software Engineer", "Boston Consulting Group", Location.Trondheim, Experience.Mid, 710000, "Boston Consulting Group partners with leaders in business and society to tackle their most important challenges and capture their greatest opportunities. BCG was the pioneer in business strategy when it was founded in 1963. Today, we help clients with total transformation-inspiring complex change, enabling organizations to grow, building competitive advantage, and driving bottom-line impact."));
        app.vacancyRepository.save(new Vacancy("Senior Java developer", "DXC", Location.Trondheim, Experience.Senior, 1030000, "DXC Technology (DXC: NYSE) is the worlds leading independent, end-to-end IT services company, helping clients harness the power of innovation to thrive on change. Created by the merger of CSC and the Enterprise Services business of Hewlett Packard Enterprise, DXC Technology serves nearly 6,000 private and public sector clients across 70 countries. The companys technology independence, global talent and extensive partner network combine to deliver powerful next-generation IT services and solutions. DXC Technology is recognised among the best corporate citizens globally."));
        app.vacancyRepository.save(new Vacancy("Junior Software Developer", "First Engineers", Location.Stavanger, Experience.Entry, 454000, "Help us accelerate the world’s transformation to digital assets. Norwegian Block Exchange is looking for software developers. Norwegian Block Exchange (NBX) is building the best cryptocurrency exchange and digital ecosystems for consumers and institutions, optimizing ways for businesses across industries to operate. NBX will lead the community for distributed ledger technologies and other digital assets through security, integrity and customer experience."));
        app.vacancyRepository.save(new Vacancy("Full Stack Developer", "Full Stack Inc", Location.Stavanger, Experience.Senior, 620000, "We are looking for a Sr. Full Stack developer to join the customer team and help in solving challenging integrations by delivering quality code. Experience in Java development and Spring Boot is must have. Experience with Cloud based solutions. Ability to take initiative in solving complex problems. Being a team player and getting things done. Good communication skills in both English and Norwegian (English is a must, Norwegian or Swedish is desired)."));
        app.vacancyRepository.save(new Vacancy("Senior Software Engineer", "Everbridge", Location.Stavanger, Experience.Senior, 920000, "Everbridge: a fast-growing global provider of SaaS-based critical communications and enterprise safety solutions currently have a fantastic opportunity for Senior Software Engineer to be based in one of our Norwegian offices: Oslo, Stavanger/Sandnes or Bergen."));
    }

    @Test
    public void testVacancyLength() {
        Assert.assertEquals(22, app.vacancyRepository.count());
    }

    @Test
    public void testNumberOfVacanciesInLocation() {
        app.lastLocationSearch = "Oslo";
        app.isFilteredByLocation = true;
        Assert.assertEquals(10, app.filterVacancies().size());
        app.lastLocationSearch = "Trondheim";
        app.isFilteredByLocation = true;
        Assert.assertEquals(4, app.filterVacancies().size());
        app.lastLocationSearch = "Bergen";
        app.isFilteredByLocation = true;
        Assert.assertEquals(4, app.filterVacancies().size());
        app.lastLocationSearch = "Stavanger";
        app.isFilteredByLocation = true;
        Assert.assertEquals(4, app.filterVacancies().size());
    }

    @Test
    public void testNumberOfVacanciesIn() {
        app.lastLocationSearch = "Oslo";
        app.isFilteredByLocation = true;
        Assert.assertEquals(10, app.filterVacancies().size());
        app.lastLocationSearch = "Trondheim";
        app.isFilteredByLocation = true;
        Assert.assertEquals(4, app.filterVacancies().size());
        app.lastLocationSearch = "Bergen";
        app.isFilteredByLocation = true;
        Assert.assertEquals(4, app.filterVacancies().size());
        app.lastLocationSearch = "Stavanger";
        app.isFilteredByLocation = true;
        Assert.assertEquals(4, app.filterVacancies().size());
    }
}
