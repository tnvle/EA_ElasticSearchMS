package ea.sof.ms_elastic_search;

import ea.sof.ms_elastic_search.controller.ElasticSearchController;
import ea.sof.ms_elastic_search.model.ScoredQuestionQueueModel;
import ea.sof.ms_elastic_search.service.ElasticSearchService;
import ea.sof.ms_elastic_search.service.RedisQuestionService;
import ea.sof.shared.queue_models.QuestionQueueModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
public class ControllerTest {

    @InjectMocks
    ElasticSearchController elasticSearchController;

    @Mock
    ElasticSearchService elasticSearchService;

    @Mock
    RedisQuestionService redisQuestionService;

    @Test
    public void testSearch(){

//        QuestionQueueModel ques1 = new QuestionQueueModel("111", "Question 1", "Body of question 1", null);
//        ScoredQuestionQueueModel scoredQues1 = new ScoredQuestionQueueModel(Double.valueOf(0.55), ques1);
//
//        Map<String, ScoredQuestionQueueModel> redisQuestions
//        Mockito.when(redisQuestionService.findAll("abc")).thenReturn(new ResponseEntity<>(response, HttpStatus.OK));

    }
}
