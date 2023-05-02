package com.fastcampus.projectboard.repository;

import com.fastcampus.projectboard.config.JpaConfig;
import com.fastcampus.projectboard.domain.Article;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@DisplayName("JPA 연결 테스트")
@Import(JpaConfig.class)
@DataJpaTest
class JpaRepositoryTest {
    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    public JpaRepositoryTest(
            ArticleRepository articleRepository,
            ArticleCommentRepository articleCommentRepository
    ) {
        this.articleRepository = articleRepository;
        this.articleCommentRepository = articleCommentRepository;
    }

    @DisplayName("insert 테스트")
    @Test
    void givenTestData_whenInserting_thenWorksFine()
    {
        // Given

//        insert 테스트
//        long previousCount = articleRepository.count();

        // When

//        insert 테스트
//        Article savedArticle = articleRepository.save(new Article("new article", "new Content", "new hashtag"));

//        select 테스트
//        List<Article> articles = articleRepository.findAll();

        // Then

//        insert 테스트
//        assertThat(articleRepository.count())
//                .isEqualTo(previousCount+1);
    }
}