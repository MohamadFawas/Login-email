package com.defect.tracker.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QModule is a Querydsl query type for Module
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QModule extends EntityPathBase<Module> {

    private static final long serialVersionUID = 1759913779L;

    public static final QModule module = new QModule("module");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QModule(String variable) {
        super(Module.class, forVariable(variable));
    }

    public QModule(Path<? extends Module> path) {
        super(path.getType(), path.getMetadata());
    }

    public QModule(PathMetadata metadata) {
        super(Module.class, metadata);
    }

}

