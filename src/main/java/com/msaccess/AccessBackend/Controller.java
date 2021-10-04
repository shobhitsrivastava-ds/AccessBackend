package com.msaccess.AccessBackend;

import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.GraphQLError;
import graphql.schema.GraphQLSchema;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//("/api")
public class Controller {

    @PostMapping("/graphql")
    public /*ResponseEntity<Object>*/ void getData(@RequestBody String body)
    {
        System.out.println("THE DATA OBTAINED IS = "+body);
//    GraphQLSchema schema = GraphQLSchema.newSchema()
//            .query(queryType)
//            .build();
//
//    GraphQL graphQL = GraphQL.newGraphQL(schema)
//            .build();
//
//    ExecutionInput executionInput = ExecutionInput.newExecutionInput().query("query { hero { name } }")
//            .build();
//
//    ExecutionResult executionResult = graphQL.execute(executionInput);
//
//    Object data = executionResult.getData();
//    return(ResponseEntity);
//    //List<GraphQLError> errors = executionResult.getErrors();
    }
}
