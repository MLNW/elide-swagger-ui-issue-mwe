/*    
 * Copyright 2020, Yahoo Inc.    
 * Licensed under the Apache License, Version 2.0    
 * See LICENSE file in project root for terms.    
 */

package de.cgi.lr.elide;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "security")
@Data
public class SecurityConfigProperties
{
    private String origin = "*";
}
