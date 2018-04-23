FROM kibana-oss:latest

ADD search-guard-kibana-plugin-6.2.3-12.zip /usr/share/kibana/temp/

RUN bin/kibana-plugin install file:///usr/share/kibana/temp/search-guard-kibana-plugin-6.2.3-12.zip