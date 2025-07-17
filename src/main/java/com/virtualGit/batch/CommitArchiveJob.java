// package com.virtualGit.batch;

// import org.springframework.batch.core.Job;
// import org.springframework.batch.core.Step;
// import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
// import org.springframework.batch.core.configuration.JobBuilderFactory;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// @EnableBatchProcessing
// public class CommitArchiveJob {

//     private final JobBuilderFactory jobBuilderFactory;

//     public CommitArchiveJob(JobBuilderFactory jobBuilderFactory) {
//         this.jobBuilderFactory = jobBuilderFactory;
//     }

//     @Bean
//     public Job archiveOldCommitsJob(Step step) {
//         return jobBuilderFactory.get("archiveOldCommitsJob")
//                 .start(step)
//                 .build();
//     }
// }
