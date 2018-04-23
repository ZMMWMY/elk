FROM elasticsearch:latest

ADD search-guard/search-guard-6-6.2.3-22.0.zip /usr/share/elasticsearch/temp/

COPY config/sg/ config/sg/
COPY bin/ bin/

RUN elasticsearch-plugin install -b file:///usr/share/elasticsearch/temp/search-guard-6-6.2.3-22.0.zip  \
	&& chmod +x plugins/search-guard-6/tools/*.sh \
	&& chown -R elasticsearch config/sg/ \
	&& chmod -R go= config/sg/
